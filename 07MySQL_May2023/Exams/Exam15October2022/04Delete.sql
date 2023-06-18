DELETE w FROM waiters AS w
WHERE (SELECT COUNT(*) FROM orders AS o WHERE w.id = o.waiter_id) = 0;