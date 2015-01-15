import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.util.ArrayList;
import java.util.List;


public class FileVisit {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("./src").toAbsolutePath();
		{
			SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>(){
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
					System.out.println(file.toString());
					return FileVisitResult.CONTINUE;
				}
			};
			Files.walkFileTree(path, visitor);
		}

		{
			Visitor visitor = new Visitor();
			Files.walkFileTree(path, visitor);
			List<String> lists = visitor.getResult();
			for(String absPath : lists){
				System.out.println(absPath);
			}
		}

	}
	public static class Visitor extends SimpleFileVisitor<Path>{
		List<String> fileLists = new ArrayList<String>();

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			fileLists.add(file.toString());
			return FileVisitResult.CONTINUE;
		}
		public List<String> getResult(){
			return fileLists;
		}
	}
}
