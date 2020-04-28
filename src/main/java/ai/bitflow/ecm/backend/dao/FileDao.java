package ai.bitflow.ecm.backend.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FileDao {

	private final Logger logger = LoggerFactory.getLogger(FileDao.class);
	
	@Value("${app.upload.root.path}")
	private String UPLOAD_ROOT_PATH;
	
//	public boolean newFile(Document item) throws IOException {
//		String fsdir = UPLOAD_ROOT_PATH + ((item.getPath())==null?"":item.getPath());
//		File dir = new File(fsdir);
//		logger.debug("dir " + dir.exists() + " " + fsdir);
//		if (!dir.exists()) {
//			boolean success = dir.mkdirs();
//		}
//		
//		BufferedWriter writer = null;
//		try {
//			writer = new BufferedWriter(new FileWriter(fsdir + File.separator + item.getId() + ".html"));
//			writer.write(item.getContent());
//		    return true;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			if (writer!=null) {
//				try {
//					writer.close();
//				} catch (IOException e) { }
//			}
//		}
//	}
	
}
