DELIMITER $$

CREATE PROCEDURE usp_get_holders_with_balance_higher_than(num DECIMAL(19,4))

BEGIN
	SELECT first_name, last_name FROM account_holders ah
    JOIN accounts a ON ah.id = a.account_holder_id
    GROUP BY ah.id
    HAVING SUM(a.balance) > num
    ORDER BY ah.id;
END $$

