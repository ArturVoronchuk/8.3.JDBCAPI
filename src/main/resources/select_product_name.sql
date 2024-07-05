select product_name
from netology.ORDERS o
         join netology.CUSTOMERS c on c.id = o.customer_id
where lower(c.name) = lower(:name);