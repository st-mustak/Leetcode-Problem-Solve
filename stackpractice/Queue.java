package stackpractice;

//Queue implementation in Java

public class Queue {
int SIZE;
int items[];
int front, rear;

Queue(int SIZE) {
items = new int[SIZE];
 front = -1;
 rear = -1;
}

boolean isFull() {
 if (front == 0 && rear == SIZE - 1) {
   return true;
 }
 return false;
}

boolean isEmpty() {
 if (front == -1)
   return true;
 else
   return false;
}

void enQueue(int element) {
 if (isFull()) {
   System.out.println("Queue is full");
 } else {
   if (front == -1)
     front = 0;
   rear++;
   items[rear] = element;
   System.out.println("Inserted " + element);
 }
}

int deQueue() {
 int element;
 if (isEmpty()) {
   System.out.println("Queue is empty");
   return (-1);
 } else {
   element = items[front];
   if (front >= rear) {
     front = -1;
     rear = -1;
   } /* Q has only one element, so we reset the queue after deleting it. */
   else {
     front++;
   }
   System.out.println("Deleted -> " + element);
   return (element);
 }
}

void display() {
 /* Function to display elements of Queue */
 int i;
 if (isEmpty()) {
   System.out.println("Empty Queue");
 } else {
   System.out.println("\nFront index-> " + front);
   System.out.println("Items -> ");
   for (i = front; i <= rear; i++)
     System.out.print(items[i] + "  ");

   System.out.println("\nRear index-> " + rear);
 }
}

public static void main(String[] args) {
 Queue q = new Queue(4);

 // deQueue is not possible on empty queue

 // enQueue 5 elements
 q.enQueue(1);
 q.enQueue(2);
 q.enQueue(3);
 q.enQueue(4);


 // 6th element can't be added to because the queue is full

 q.display();
 
 q.deQueue();
 
 q.display();
 
 q.enQueue(5);

 // deQueue removes element entered first i.e. 1

 // Now we have just 4 elements
}
}