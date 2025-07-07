**Jedlik's Toy Car Console App**

- **Reference: [Exercism's Java Track](https://exercism.org/tracks/java)**
- **`Learning Exercise`**

# Instructions

In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

- The total distance it has driven, displayed as: `"Driven <METERS> meters"`.
- The remaining battery charge, displayed as: `"Battery at <PERCENTAGE>%"`.

If the battery is at 0%, you can't drive the car anymore and the battery display will show `"Battery empty"`.

You have six tasks, each of which will work with remote controlled car instances.

1. Buy a brand-new remote controlled car
   - It returns a brand-new remote controlled car instance
2. Display the distance driven
   - It returns the distance as displayed on the LED display
3. Display the battery percentage
4. Update the number of meters driven when driving
5. Update the battery percentage when driving
6. Prevent driving when the battery is drained
