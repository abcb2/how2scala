import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;


public class FileVisit {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./src").toAbsolutePath();
		Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
				System.out.println(file.toString());
				return FileVisitResult.CONTINUE;
			}
		});
	}
}
