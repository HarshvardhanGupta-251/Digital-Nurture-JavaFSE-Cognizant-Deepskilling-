package Engineering_Concepts.Alog_DS.Task_Management_System;

public class TaskManager {

    Node head = null;

    // Add Task
    void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {

            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Search Task
    void searchTask(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.taskId == id) {

                System.out.println(
                        "Task Found:");

                temp.task.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println(
                "Task Not Found");
    }

    // Traverse Tasks
    void traverseTasks() {

        Node temp = head;

        System.out.println(
                "\nTask List:");

        while (temp != null) {

            temp.task.display();

            temp = temp.next;
        }
    }

    // Delete Task
    void deleteTask(int id) {

        if (head == null) {

            System.out.println(
                    "List is Empty");

            return;
        }

        if (head.task.taskId == id) {

            head = head.next;

            System.out.println(
                    "Task Deleted");

            return;
        }

        Node temp = head;

        while (temp.next != null &&
               temp.next.task.taskId != id) {

            temp = temp.next;
        }

        if (temp.next == null) {

            System.out.println(
                    "Task Not Found");

            return;
        }

        temp.next = temp.next.next;

        System.out.println(
                "Task Deleted");
    }

    public static void main(String args[]) {

        TaskManager manager =
                new TaskManager();

        manager.addTask(
                new Task(
                        101,
                        "Design UI",
                        "Pending"));

        manager.addTask(
                new Task(
                        102,
                        "Write Code",
                        "In Progress"));

        manager.addTask(
                new Task(
                        103,
                        "Testing",
                        "Completed"));

        manager.traverseTasks();

        manager.searchTask(102);

        manager.deleteTask(102);

        manager.traverseTasks();
    }
}
