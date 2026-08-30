package com.banking.transactionservice.entity;


/**
 * Transaction LifeCycle FLow:
 * PENDING -> PROCESSING -> COMPLETED  (Clean transaction)
 * PENDING -> PROCESSING -> PENDING VERIFICATION (suspicion detected)
 *                                  -> COMPLETED (verified)
 *                                  -> FLAGGED (SAGA REFUND)
 *                       -> FAILED
 *                       -> FLAGGED
 */
public enum TransactionStatus {
    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
