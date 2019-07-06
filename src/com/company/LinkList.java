package com.company;


class Node {
    public int data;//как правило, под узлом будем понимать указатель на следующий элемент и данные, которые мы хотим хранить
    public Node next;

    Node(int data) {
        this.data = data; // инициализируем значение

    }
}


public class LinkList {
    public Node head;

    public void addToTheLast(Node node) {

        if (head == null) { //если список пуст, то указываем ссылку начала на новый элемент
            head = node;
        } else {
            Node temp = head;//получаем ссылку на первый элемент
            while (temp.next != null)
                temp = temp.next;//переключаемся на следующий элемент
            temp.next = node;//старый последниго элемента ссылается на новый
        }
    }


    public void printList() {//вывод элементов в списке
        Node element = head;//получаем ссылку на первый элемент
        while (element != null) {//пока элемент существует
            System.out.format("%d ", element.data);//печатаем его данные
            element = element.next;//и переходим на следующий
        }
        System.out.println();
    }
    /*
    Основная идея алгоритма: алгоритм Флойда, в котором  используются два указателя fast и slow, где мы  fast перемещаем на два узла, slow на один узел в каждой итерации.
    Если fast и slow встречаются на некоторой итерации, то в связном списке есть цикл.
     */
    public boolean ifLoopExists() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;

        }
        return false;
    }

}