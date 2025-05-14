package com.example.atividadeJWT2BIM.enums;


public enum Status {
    PENDENTE("pendente"),
    EM_ANDAMENTO("em andamento"),
    CONCLUIDA("concluída");
    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
