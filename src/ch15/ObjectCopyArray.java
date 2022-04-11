package ch15;

public class ObjectCopyArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5]; //복사할 배열 생성

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        System.out.println("== library ==");
        for (int i = 0; i < library.length; i++) {
            //  System.out.println(library[i]);
            library[i].showBookInfo();
        }
            System.out.println("== copy library ==");
            for (int j = 0; j < copyLibrary.length; j++) {
                //  System.out.println(library[i]);
                library[j].showBookInfo();
            }
        }
    }

