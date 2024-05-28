package net.aya.angular.dtos;

import lombok.Data;

@Data
public class TransferDTO {
    private String accountSourceId;
    private String accountDestinationId;

    private double amount;
    private String description;
}