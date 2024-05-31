public class UrlNode {
    String url;
    UrlNode next;
    UrlNode prev;

    public UrlNode(String url) {
        this.url = url;
        next = null;
        prev = null;
    }
}
