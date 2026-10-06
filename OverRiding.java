package sayed.java;


	// class and object
	// variable method constructor and block
	class Parent {
		void property() {
			System.out.println("Property");
		}

		void marry() {
			System.out.println("family selection");
		}
	
	}
	public class OverRiding extends Parent {
		void marry() {
			System.out.println(" campus selection");
		}

		public static void main(String[] args) {
	
OverRiding  bb = new OverRiding();
bb.property();
bb.marry();


		}
	}


