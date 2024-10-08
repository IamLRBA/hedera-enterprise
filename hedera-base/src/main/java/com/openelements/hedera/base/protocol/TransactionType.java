package com.openelements.hedera.base.protocol;

public enum TransactionType {
    ACCOUNT_CREATE,
    ACCOUNT_DELETE,
    ACCOUNT_UPDATE,
    ACCOUNT_ALLOWANCE_APPROVAL,
    TRANSFER,
    TOPIC_CREATE,
    TOPIC_UPDATE,
    TOPIC_MESSAGE_SUBMIT,
    TOPIC_DELETE,
    TOKEN_CREATE,
    TOKEN_UPDATE,
    TOKEN_DELETE,
    TOKEN_ASSOCIATE,
    TOKEN_DISSOCIATE,
    TOKEN_MINT,
    TOKEN_BURN,
    TOKEN_FREEZE,
    TOKEN_FEE_SCHEDULE_UPDATE,
    TOKEN_UNFREEZE,
    TOKEN_GRANT_KYC,
    TOKEN_REVOKE_KYC,
    TOKEN_PAUSE,
    TOKEN_UNPAUSE,
    TOKEN_WIPE,
    FILE_CREATE,
    FILE_APPEND,
    FILE_UPDATE,
    FILE_DELETE,
    CONTRACT_CREATE,
    CONTRACT_UPDATE,
    CONTRACT_DELETE,
    ETHEREUM;
}
