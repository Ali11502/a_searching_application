import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) {
        WordLinkedList wordLinkedList = new WordLinkedList();
        wordLinkedList.modifiedInsert("Peshawar", "wiki.com");
        wordLinkedList.modifiedInsert("peshawar", "Peshawar_university.com");
        wordLinkedList.modifiedInsert("peshawar", "Pesh_university.com");
        wordLinkedList.modifiedInsert("karachi", " ttt.pk");
        wordLinkedList.modifiedInsert("karachi", "dpdkd.com");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word: ");
        String word=sc.next();
        wordLinkedList.modifiedSearch(word);


    }


}
