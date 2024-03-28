package sec01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;







@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FileUpload 서버초기화됨");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		File serverRepo=new File("C:\\file_repo");
		
		System.out.println("서버에 저장될 경로: "+serverRepo);
		
		//DiskFileItemFactory
		//기본 FileItemFactory 구현입니다. 이 구현은 작은 항목의 경우 콘텐츠를 메모리에, 
		//큰 항목의 경우 디스크의 임시 파일에 보관하는 FileItem 인스턴스를 만듭니다. 
		//콘텐츠가 디스크에 저장되는 크기 임계값은 임시 파일이 생성될 디렉터리와 마찬가지로 구성 가능합니다.

		DiskFileItemFactory factory = new DiskFileItemFactory();
//		System.out.println(factory);
		
		//파일크기 한계지정 byte 기준
		factory.setSizeThreshold(1024*1024);
		
		ServletFileUpload upload =new ServletFileUpload(factory);
		
//		System.out.println("upload 객체: "+upload);
		
		try {
			List<FileItem> fileItemList=upload.parseRequest(request);
			
			System.out.println("파일아이템 객체: "+fileItemList);
			
			System.out.println("item크기: "+fileItemList.size());
			
			for(int i=0;i<fileItemList.size();i++) {
//				System.out.println(fileItemList.get(i)); 
				
				FileItem fileItem= fileItemList.get(i);
				
				System.out.println(fileItem.getName()+"아이템의 사이즈: "+fileItem.getSize()+" bytes");
				if(fileItem.getSize()>0) {
					
					if(fileItem.isFormField()) {
//						System.out.println("여기는 폼필드");
						System.out.println(fileItem.getFieldName()+ "="+ fileItem.getString());
					}else {
//						System.out.println("여기는 폼필드아닌내용");
//						System.out.println("파일명: "+fileItem.getName());
						String uploadFileName = fileItem.getName();
						
						int idx=uploadFileName.lastIndexOf("\\");
//						System.out.println(idx);
						String fileName= uploadFileName.substring(idx + 1);
						System.out.println("최종 업로드할 파일명 :"+fileName);
						
						File uploadFile = new File(serverRepo + "\\" + fileName);
						System.out.println("서버에 올라갈 경로: "+ uploadFile);
						fileItem.write(uploadFile);
						
						
					}
					
				}
				
				
			}
		} catch (Exception e) {
			System.out.println("##파일 업로드시 ##예외##");
		}
				
		
	}

}
