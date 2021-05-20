public class AppTest {

    // public static void testQueue(Queue<Integer> queue) {
    //     queue.enqueue(1);
    //     queue.enqueue(3);
    //     queue.enqueue(5);
    //     queue.enqueue(7);

    //     for (Integer i : queue) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    //     System.out.println(queue.size());
    //     queue.delete(3);
    //     System.out.println(queue.dequeue());

    //     for (Integer i : queue) {
    //         System.out.print(i + " ");
    //     }

    // }

    public static void main(String[] args) {
        // Queue<Integer> queue = new LinklListQueue<>();
        // testQueue(queue);
        SymbleTable<Integer,String> bst = new BSTSymbolTable<>();
        bst.put(5, "Phan Thi Hang");
        bst.put(8, "Nguyen Tung Duong");
        bst.put(9, "Hoang Duc Hai");
        bst.put(7, "Nguyen Anh Tuan");
        bst.put(4, "Luong Xuan Anh");
        bst.put(3, "Bui Tien Dung");
        bst.put(6, "Pham Thi Huyen");
        bst.put(10, "Nguyen Tuan Anh");
        bst.put(1, "Luu Van Thang");
        bst.put(2, "Nguyen Ngoc Anh");

        System.out.println(bst.size());
        for(Integer i : bst.Keys()){
            System.out.println(i + " -> " + bst.get(i));
        }

    }
}
