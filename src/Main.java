import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
        System.out.println(linkedList2);
        linkedList2.poll();
        System.out.println(linkedList2);
        linkedList2.remove("B");
        linkedList2.add(0,"0");
        System.out.println(linkedList2);



        }
    }