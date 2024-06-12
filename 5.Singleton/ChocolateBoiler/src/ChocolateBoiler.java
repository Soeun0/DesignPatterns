public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance; //정적변수

    private ChocolateBoiler() { //private라서 해당 클래스 내에서만 인스턴스 생성 가능
        empty = true;
        boiled = false;
        // 보일러에 우유와 초콜릿을 혼합한 재료
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) { //다른 곳에서 생성되지 않았을 때만 인스턴스 생성
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if(isEmpty()) {
            // 끓인 재료를 다음 단계로 넘김
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // 재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}