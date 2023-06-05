DELIMITER $$
CREATE FUNCTION ufn_calculate_future_value(sum DECIMAL(19,4), yearly_interest_rate DOUBLE, number_of_years INT)

RETURNS DECIMAL(19,4)
DETERMINISTIC
BEGIN
	RETURN sum * pow((1 + yearly_interest_rate), number_of_years);
END $$

CREATE PROCEDURE usp_calculate_future_value_for_account(id INT, interest_rate DECIMAL(19,4))

BEGIN
	SELECT a.id AS account_id,
    ah.first_name,
    ah.last_name,
    a.balance AS currnet_balance,
    ufn_calculate_future_value(a.balance,interest_rate, 5) AS balance_in_5_years FROM account_holders ah
    JOIN accounts a ON ah.id = a.account_holder_id
    WHERE a.id = id; 
END $$
