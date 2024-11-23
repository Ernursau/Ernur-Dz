public class FileSystemTest {
    public static void main(String[] args) {

        File file1 = new File("Файл1.txt", 100);
        File file2 = new File("Файл2.txt", 200);
        File file3 = new File("Файл3.txt", 300);


        Directory root = new Directory("Начало");
        Directory folder1 = new Directory("Папка1");
        Directory folder2 = new Directory("Папка2");

        root.addComponent(folder1);
        root.addComponent(folder2);
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);

        // Выводим содержимое файловой системы
        System.out.println("Структура файловой системы:");
        root.display("");

        // Выводим общий размер файловой системы
        System.out.println("\nОбщий размер файловой системы: " + root.getSize() + " Байт");
    }
}
