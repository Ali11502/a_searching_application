public class WordNode {
    String word;
    WordNode next;
    WordNode prev;
    UrlList urlList;

    public WordNode(String word) {
        this.word = word;
        next = null;
        prev = null;
        urlList = new UrlList();
        urlList.head = null;
    }
}
