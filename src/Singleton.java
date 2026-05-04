public class Singleton {

    static class SystemManager {
        private static SystemManager instance;

        private SystemManager() {}

        public static SystemManager getInstance() {
            if (instance == null) {
                instance = new SystemManager();
            }
            return instance;
        }

        public void show() {
            System.out.println("System Manager Running...");
        }
    }
}