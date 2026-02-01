public class Main {
    public static void displayList(MyList<?> list) {
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {

        MyList<Integer> arrayList = new MyArrayList<>();
        MyList<String> linkedList = new MyLinkedList<>();

        try {
            arrayList.add(10);
            arrayList.add(20);
            arrayList.insert(15, 1);
            linkedList.add("A");
            linkedList.add("B");
            linkedList.delete(0);
            System.out.println("Array List:");
            displayList(arrayList);
            System.out.println("Linked List:");
            displayList(linkedList);
            arrayList.get(10);
        } catch (IndexOutOfBoundsException | IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
