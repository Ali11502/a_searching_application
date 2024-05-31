public class WordLinkedList {
    WordNode head;
    private boolean b = true;
    static final String[] arr = {"A", "B", "C", "D",
            "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w"
            , "x", "y", "z"};
    WordLinkedList[] wordLinkedLists;

    public WordLinkedList() {
        head = null;

    }


    private void initialize() {
        wordLinkedLists = new WordLinkedList[arr.length];
        for (int i = 0; i < wordLinkedLists.length; i++) {
            wordLinkedLists[i] = new WordLinkedList();
        }
    }

    public void modifiedInsert(String word, String url) {
        if (b) {
            initialize();
            b = !b;
        }
        for (int i = 0; i < arr.length; i++) {
            String s = "" + word.charAt(0);
            if (arr[i].equalsIgnoreCase(s)) {
                wordLinkedLists[i].insert(word, url);
            }
        }
    }

    public void modifiedSearch(String word) {

        UrlList urlList = null;
        String s = "" + word.charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(s)) {
                urlList = wordLinkedLists[i].search(word);
            }
        }
        System.out.println(urlList);
       // return urlList;
    }

    private void insert(String word, String url) {
        WordNode wordNode = new WordNode(word);
        WordNode temp = null;
        if (head == null) {
            head = wordNode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = wordNode;
        }
        WordNode temp2 = head;
        if (temp2.word.equalsIgnoreCase(word)) {
            temp2.urlList.insert(url);
        } else {
            while (!temp2.word.equalsIgnoreCase(word)) {
                temp2 = temp2.next;
            }
            temp2.urlList.insert(url);
        }
    }

    private UrlList search(String word) {
        WordNode temp = head;
        if (temp.word.equalsIgnoreCase(word)) {
            System.out.println("for word: " + word + " we have these urls");
            return temp.urlList;
        } else {
            while (!temp.word.equalsIgnoreCase(word) && temp.next != null) {
                temp = temp.next;
            }
            if (temp.word.equalsIgnoreCase(word)) {
                System.out.println("for word: " + word + " we have these urls");
                return temp.urlList;
            } else if (temp.next == null) System.out.println("no search results");
            return null;
        }
    }

    public String modifiedDelete(String word) {
        String s = "" + word.charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(s)) {
                s = wordLinkedLists[i].delete(word);
            }
        }
        return s;
    }

    private String delete(String word) {
        WordNode wordNode;
        WordNode temp = head;
        if (temp.word.equalsIgnoreCase(word)) {
            wordNode = new WordNode(head.word);
            head = head.next;
            return wordNode.word;
        } else {
            while (!temp.next.word.equalsIgnoreCase(word) && temp.next.next != null) {
                temp = temp.next;
            }
            if (temp.next.word.equalsIgnoreCase(word)) {
                if (temp.next.next != null) {
                    wordNode = new WordNode(temp.next.word);
                    temp.next = temp.next.next;
                    return wordNode.word;
                } else {
                    wordNode = new WordNode(temp.next.word);
                    temp.next = null;
                    return wordNode.word;
                }
            }
        }
        return "no such word";
    }
}
