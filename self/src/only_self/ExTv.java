package only_self;

public class ExTv {
		
		int time;
		
		ExTv(int time){
			this.time = time;
		}
		
		// 메서드: 반환타입 메서드명 (매개변수)
		void powerOn(){
			
		}
		void powerOff() {
			
		}
		
		 boolean Tv(int time) {
			if(this.time ==time) {
				return true;
			} return false;
		}
		
		
		
		public static void main(String[] args) {
			ExTv cal = new ExTv(2);
			boolean tv = cal.Tv(2);
			if(tv) {
				cal.powerOn();
				System.out.println("on");
			} else {
				cal.powerOff();
			}
		}
		
	}


