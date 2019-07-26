package wyc.pojo;

/**
 * 文件类
 * @author Yicheng Wang
 */
public class File {
	
	private int id;
	private String fileName;
	private String downloadCounts;

	public File() {
		super();
	}

	public File(int id, String fileName, String downloadCounts) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.downloadCounts = downloadCounts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDownloadCounts() {
		return downloadCounts;
	}

	public void setDownloadCounts(String downloadCounts) {
		this.downloadCounts = downloadCounts;
	}

	@Override
	public String toString() {
		return "File [id=" + id + ", fileName=" + fileName + ", downloadCounts=" + downloadCounts + "]";
	}

}
