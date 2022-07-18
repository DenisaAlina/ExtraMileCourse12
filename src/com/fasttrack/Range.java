package com.fasttrack;

public class Range {
        private int low;
        private int high;

        public Range(int low, int high){
            this.low = low;
            this.high = high;
        }

        public boolean contains(int number){
            return (number >= low && number <= high);
        }

    @Override
    public String toString() {
        return "Range{" +
                "low=" + low +
                ", high=" + high +
                '}';
    }
}
