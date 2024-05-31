public class UrlList {
    UrlNode head;

    public UrlList() {
        head = null;
    }

    public void insert(String url) {
        UrlNode n = new UrlNode(url);
        UrlNode temp = null;
        if (head == null) {
            head = n;
        } else {
            temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = n;
        }
    }

    public String toString() {
        if (head != null) {
            UrlNode temp = head;
            while (temp != null) {
                System.out.println(temp.url);
                temp = temp.next;
            }
        } else System.out.println("null");
        return "End of search";
    }
}
