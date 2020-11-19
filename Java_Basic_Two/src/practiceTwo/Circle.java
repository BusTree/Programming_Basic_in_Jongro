package practiceTwo;

public class Circle {
    private double x1, x2, y1, y2, rad1, rad2;
    private String msg;
    
    public Circle(double x1, double x2, double y1, double y2, double rad1, double rad2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.rad1 = rad1;
        this.rad2 = rad2;
        this.msg = CirLogic();
	}

	public void setPosition(double x1, double x2, double y1, double y2, double rad1, double rad2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.rad1 = rad1;
        this.rad2 = rad2;
        this.msg = CirLogic();
	}
	
	private double Distance() { // 두 원의 중심 간 거리
		return Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2));
	}
	
	private String CirLogic() { // 두 원의 관계에 대한 판별식
		double dis = Distance();
		if ((Math.abs(rad2-rad1) < dis) && (Math.abs(rad1+rad2) > dis)) {
            msg = "두 원은 두 점에서 만납니다.(중첩)"
		} else if ((Math.abs(rad1 + rad2) == dis) || (Math.abs(rad2 - rad1) == dis)) {
            msg = "두 원은 한 점에서 만납니다.(중첩)"
		} else if ((Math.abs(rad2 - rad1) > dis) || (dis == 0)) {
            msg = "두 원은 어떠한 점에서도 만나지 않지만 포함관계입니다.(중첩)"
		} else {
            msg = "두 원은 만나지 않습니다."
		}
        return msg
    }
    public getCir() {
        return this.msg
    }

}
