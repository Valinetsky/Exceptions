import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextToFileOutput {
	public String filePath;

	public void writeContact(Human human) {
		checkOrCreateFile(human.getLastName());
		try {
			String contact = String.format("%s %s %s %s %d %c \n",
					human.getLastName(),
					human.getFirstName(),
					human.getPatronymic(),
					human.getBirthday(),
					human.getPhoneNumber(),
					human.getGender());
			Files.write(Paths.get(this.filePath), contact.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("Ошибка работы с файлом!!!");
			e.printStackTrace();
		}
	}

	private void checkOrCreateFile(String fileName) {
		String localPath = this.getClass().getResource("").getPath();
		System.out.println(localPath);
		String pathFile = localPath.concat("files/" + fileName + ".txt");
		pathFile = pathFile.substring(1);
		System.out.println(pathFile);

		try {
			File file = new File(pathFile);
			if (file.createNewFile()) {
				System.out.println("Работа с файлом: создан новый файл.");
			} else {
				System.out.println("Работа с файлом: файл существует, строка добавлена.");
			}
		} catch (IOException e) {
			System.out.println("Ошибка работы с файлом!!!");
			e.printStackTrace();
		}
		this.filePath = pathFile;
	}
}