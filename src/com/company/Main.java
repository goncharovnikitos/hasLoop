package com.company;



public class Main {

    public static void main(String[] args) {

        LinkList list = new LinkList(); // Создаем список  и будем в дальнейшем заполнять его узлами

        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.printList();
        //вариант примера без петли

        /*Node loopNode=new Node(3);
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(9));
        list.addToTheLast(loopNode);
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));

        list.printList();

        list.addToTheLast(loopNode);// создаем петлю - с указателем на 3
        //вариант примера с петлей*/

        // Итоговый результат, который выдает, есть ли петля в односвязном списке или нет
        if (list.ifLoopExists())
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }


}


