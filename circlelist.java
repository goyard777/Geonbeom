
interface Queue{
	boolean isEmpty();
	boolean isfull();
	char dequeue();
	char peek();
	void clear();
	void enqueue(char item);
//	큐의 입 /출력 /삭제 /push역할
}



public class circlelist  implements Queue{
	
	
			private int front;
			private int rear;
			private int queuesize;
			private char queueArr[];
//		queue 이외 접근 방법은 불가능하게 해야함  오류날수있음..	
				
			public circlelist(int queuesize) {
				front =0;
				rear=0;
				this.queuesize=queuesize;
				queueArr = new char[this.queuesize]; 
			}
			
//	empty 확인
			
			@Override
			public boolean isEmpty() {
			return (front==rear);
			}
			
				//큐가 비어있는지 확인  초기 공백확인.

			@Override
			public boolean isfull() {
				// TODO Auto-generated method stub
				
			return (((rear+1)%this.queuesize==front));
			}
			// 큐가 가득 차있는지 확인. +1 를 더하고 큐 크기로 나눌시  프론트값 즉 0 과 같아야한다 . 이는 원형리스트 초기값 조건 front =rear =full
			
			@Override
			public char dequeue() {
				// TODO Auto-generated method stub
				if(isEmpty()) {
					System.out.println();
					
					return 0;
				}else {
					System.out.println("삭제"+queueArr[front+1]);
					

					front =(front+1)%this.queuesize;
					// ArrayOutOfBoundException이 발생
					// que 마지막 사이즈에 대한 오류 발생으로 인하여 프론트 길이 조절 이 필요함 .	 원형큐			
					return queueArr[front];
				}
				
			}
			
			@Override
			public char peek() {
				// TODO Auto-generated method stub
				if(isEmpty()) {
					System.out.println("이제 없어");
					
					return 0;
				}else {
					
					return queueArr[(front+1)%this.queuesize];
				}
			}
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				if(isEmpty()) {
					System.out.println("Queue");
				} else {
					front =(front+1)%this.queuesize;
				}
			}
			
			
			@Override
			public void enqueue(char item) {
				// TODO Auto-generated method stub
				if(isfull()) {
					System.out.println("Queue is full!");
				} else {             
					rear=(rear+1)%this.queuesize;
					queueArr[rear] = item;   //rear 방향 표시  다음 rear 어디로 가야할지 표시
					System.out.println("입력 : " + item);
				}
			}
			
			
			
			public void printQueue() {
				// TODO Auto-generated method stub
				if(isEmpty()) {
					System.out.println();
				} else {
					
					System.out.print("출력: ");
					
					for(int i=(front+1)% this.queuesize; i!=(rear+1)%this.queuesize; i=++i% this.queuesize) {
						System.out.print(queueArr[i] + " ");
					}
					
					
					System.out.println();
				}
			}
			
			
			public static void main(String args[]) {
				int queueSize = 4;
				circlelist arrQueue = new circlelist(queueSize);
				
				arrQueue.enqueue('A');
				arrQueue.printQueue();
				
				arrQueue.enqueue('B');
				arrQueue.printQueue();
				
				arrQueue.enqueue('C');
				arrQueue.printQueue();
				
				arrQueue.dequeue();
				arrQueue.printQueue();
				
				arrQueue.dequeue();
				arrQueue.printQueue();
				
				arrQueue.dequeue();
				arrQueue.printQueue();
				
				arrQueue.peek();
				arrQueue.printQueue();			
				
				
			}
			
}

//3월 30일  circlelist  made kimGeonbeom
