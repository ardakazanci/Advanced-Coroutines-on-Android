package com.example.android.advancedcoroutines.utils


/**
 *
 * A B C D E F
 *
 * Z -> 1  YOK  return -1  positionForıtem = -1
 * A -> 2  VAR  return > -1 positionForItem = > -1
 *
 *
 * A => ComparablePair(first = 5, A)
 * Z => ComparablePair(first = 2^36*1
 *
 * 3 2 0 1 4 5
 *
 * 3 - A
 * 2 - B
 * ...
 *
 */

data class ComparablePair<A: Comparable<A>, B: Comparable<B>>(
    val first: A, // 5 - Int.MAX_VALUE
    val second: B // A - Z
) : Comparable<ComparablePair<A, B>> {
    override fun compareTo(other: ComparablePair<A, B>): Int {
        // 5 , 2 5 > 2 1 5 < 2 -1 5 == 5 0
        val firstComp = this.first.compareTo(other.first)
        // 5 != 5 return 5
        if (firstComp != 0) { return firstComp }
        // 5 == 5 -> Plants name return dönsün.
        return this.second.compareTo(other.second)
    }
}