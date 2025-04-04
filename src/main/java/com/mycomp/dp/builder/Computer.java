package com.mycomp.dp.builder;

public class Computer {
    private String model;
    private String ramSize;
    private String processorName;

    public Computer(String model, String ramSize, String processorName,ComputerBuilder computerBuilder) {
        this.model = model;
        this.ramSize = ramSize;
        this.processorName = processorName;
        
    }

    public String getModel() {
        return model;
    }

    public String getRamSize() {
        return ramSize;
    }

    public String getProcessorName() {
        return processorName;
    }
    public static class ComputerBuilder{
        private String model;
        private String ramSize;
        private String processorName;

        public ComputerBuilder(String model, String ramSize, String processorName) {
            this.model = model;
            this.ramSize = ramSize;
            this.processorName = processorName;
        }

        public ComputerBuilder model(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder ramSize(String ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder processorName(String processorName) {
            this.processorName = processorName;
            return this;
        }
        

    }
}
