Santa Claus received list with the cost of Christmas gifts `gifts`, but kid can only receive gifts with summed cost related to threshold given by his parents `maxCost`! Return indices of the two gifts prizes such that they add up to `maxCost`.

Every test example would have exactly one solution, do not count the same gift twice.

You can return the answer in any order.

 

### Example 1:

**Input:** gifts = [1,4,12,13], maxCost = 5

**Output:** [0,1]

**Explanation:** Because gifts[0] + gifts[1] == 5, we return [0, 1].
### Example 2:

**Input:** gifts = [4,3,5], maxCost = 8

**Output:** [1,2]
### Example 3:

**Input:** gifts = [2,2], maxCost = 4

**Output:** [0,1]
 

### Constraints:

- 2 <= gifts.length <= 104
- -109 <= gifts[i] <= 109
- -109 <= maxCost <= 109
- Only one and correct answer exists. (it is gonna always sum up to maxCost)
 

Hint: there is solution faster than O(n<sup>2</sup>)
