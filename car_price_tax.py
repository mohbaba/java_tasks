car_price = float(input("Enter the cost of the car: "))

if car_price < 1_000_000:
	print("Payment is #",car_price + (car_price * 0.10))
elif car_price >= 1_000_000 and car_price < 3_000_000:
	print("Payment is #",car_price * 0.15)
elif car_price >= 3_000_000 and car_price < 5_000_000:
	print("Payment is #",car_price * 0.20)
elif car_price >= 5_000_000:
	print("Payment is #",car_price * 0.25)