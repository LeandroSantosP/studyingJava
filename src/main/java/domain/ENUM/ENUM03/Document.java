package domain.ENUM.ENUM03;

public enum Document {
    CPF {
        private String value;
        @Override
        public String getValue() {
            return this.value != null ? this.value : GeraCpfCnpj.cpf();
        }
        @Override
        public void setValue(String value) {
            if (!new GeraCpfCnpj().isCPF(value)) {
                throw new IllegalArgumentException("Invalid CPF");
            }
            this.value = value;
        }
    }, CNPJ {
        private String value;
        @Override
        public String getValue() {
            return this.value != null ? this.value : GeraCpfCnpj.cnpj();
        }
        @Override
        public void setValue(String value) {
            if (!new GeraCpfCnpj().isCNPJ(value)) {
                throw new IllegalArgumentException("Invalid CNPJ");
            }
            this.value = value;
        }
    };

    public abstract String getValue();

    public abstract void setValue(String value);
}
