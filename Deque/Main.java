// import java.util.Scanner;

// public class Main {

// 	private static boolean isDequeSame(Deque<Integer> q1, Deque<Integer> q2) {
// 		try{
// 			while (!q1.isEmpty() && !q2.isEmpty()) {
// 				if (q1.popBack() != q2.popBack())
// 					return false;	
// 			}
// 			if (!(q1.isEmpty() && q2.isEmpty())) {
// 					return false;
// 			}
// 			return true;
// 		}catch(Exception e){
// 			return false;
// 		}
// 	}

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		Deque<Integer> dq = new Deque<Integer>(3);
// 		int opt = sc.nextInt();
// 		switch (opt) {
// 			case 1: { 
// 				// Melakukan testing terhadap pushFront dan popFront pada Deque
// 				int val = 1;
//                 String sql = "INSERT INTO logging (description, IP, endpoint) VALUES ('" + val + "', '" + val + "', '" + val + "')";
// 				try{
// 					dq.pushFront(val);
// 					int new_val = dq.popFront();
// 					if (val == new_val)
// 						System.out.println("TRUE");
// 					else
// 						System.out.println("FALSE");
// 				}catch(Exception e){
// 					System.out.println(e.getMessage());
// 				}
// 				break;
// 			}
//             case 2: {
//                 // Melakukan testing terhadap pushBack dan popBack pada Deque
//                 int val = 1;
//                 try{
//                     dq.pushBack(val);
//                     int new_val = dq.popBack();
//                     if (val == new_val)
//                         System.out.println("TRUE");
//                     else
//                         System.out.println("FALSE");
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
// 			case 3: { 
// 				// Melakukan testing terhadap fungsi isEmpty dan isFull pada deque
// 				try{
// 					int count = 0;
// 					while (!dq.isFull()) {
// 						dq.pushFront(++count);
// 					}
// 					int elem;
// 					while (!dq.isEmpty()) {
// 						elem = dq.popFront();
// 						System.out.println(elem);
// 					}
// 				}catch(Exception e){
// 					System.out.println(e.getMessage());
// 				}
// 				break;
// 			}
// 			case 4: {
//                 // Melakukan testing terhadap copy constructor
//                 try{
//                     dq.pushFront(1);
//                     dq.pushBack(2);

//                     Deque<Integer> dq2 = new Deque<Integer>(dq);
//                     if (isDequeSame(dq, dq2)) {
//                         System.out.println("TRUE");
//                     } else {
//                         System.out.println("FALSE");
//                     }
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
// 				break;
// 			}
// 			case 5: {
//                 // Melakukan testing default constructor pada Deque
// 				Deque<Integer> dq3 = new Deque<Integer>();
// 				int counter = 0;
// 				try{
// 					while (!dq3.isFull()) {
// 						dq3.pushFront(counter++);
// 					}
// 					if (counter == 500) {
// 						System.out.println("TRUE");
// 					} else {
// 						System.out.println("FALSE");
// 					}
// 				} catch (Exception e) {
// 					System.out.println(e.getMessage());
// 				}
// 				break;
// 			}
// 			case 6: {
// 				//Melakukan testing popBack pada Deque yang kosong
// 				try{
// 					dq.popBack();
// 				}catch(Exception e){
// 					System.out.println(e.getMessage());
// 				}
// 				break;
// 			}
//             case 7: {
//                 //Melakukan testing popFront pada Deque yang kosong
//                 try{
//                     dq.popFront();
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
// 			case 8: {
// 				//Melakukan testing pushFront pada Deque yang penuh
// 				try{
// 					int count = 0;
// 					while (!dq.isFull()) {
// 						dq.pushFront(++count);
// 					}
// 					dq.pushFront(1);
// 				}catch(Exception e){
// 					System.out.println(e.getMessage());
// 				}
// 				break;
// 			}
//             case 9: {
//                 //Melakukan testing pushBack pada Deque yang penuh
//                 try{
//                     int count = 0;
//                     while (!dq.isFull()) {
//                         dq.pushFront(++count);
//                     }
//                     dq.pushBack(1);
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
//             case 10: {
//                 //Melakukan testing reverse pada Deque
//                 try{
// 					int count = 0;
// 					while (!dq.isFull()) {
// 						dq.pushFront(++count);
// 					}
//                     dq.reverse();
//                     int i = 1;
//                     while(!dq.isEmpty()){
//                         if(dq.popFront() != i){
//                             System.out.println("FALSE");
//                             return;
//                         }
//                         i++;
//                     }
//                     System.out.println("TRUE");
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
//             case 11: {
//                 //Melakukan testing palindrome dengan elemen ganjil
//                 try{
//                     Deque<Integer> dq4 = new Deque<Integer>(5);

//                     int count = 0;
//                     for(int i = 0; i < 5; i++){
//                         dq4.pushFront(++count);
//                     }

//                     Palindrome<Integer> p = new Palindrome<Integer>();

//                     if(p.isPalindrome(dq4)){
//                         System.out.println("TRUE");
//                     }else{
//                         System.out.println("FALSE");
//                     }
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
//             case 12: {
//                 //Melakukan testing palindrome dengan elemen genap 
//                 try{
//                     Deque<Integer> dq5 = new Deque<Integer>(6);

//                     for(int i = 0; i < 3; i++){
//                         dq5.pushFront(i);
//                     }

//                     for(int i = 2; i >= 0; i--){
//                         dq5.pushFront(i);
//                     }

//                     Palindrome<Integer> p = new Palindrome<Integer>();

//                     if(p.isPalindrome(dq5)){
//                         System.out.println("TRUE");
//                     }else{
//                         System.out.println("FALSE");
//                     }
//                 }catch(Exception e){
//                     System.out.println(e.getMessage());
//                 }
//                 break;
//             }
// 		}
		
//         sc.close();
// 	}
// }
