package VremenaGoda;

public enum VremenaGoda {
        Spring(5) {
                @Override
                public String getDescription() {
                        return "Teplo";
                        }
                }, Autumn(15), Summer(20), Winter(-10);
        private int temp;
        VremenaGoda(int temp) {
                this.temp = temp;
        }

        public int getTemp() {
                return temp;
        }

        public void setTemp(int temp) {
                this.temp = temp;
        }

        public String getDescription() {
                return "Holod";
        }
}
