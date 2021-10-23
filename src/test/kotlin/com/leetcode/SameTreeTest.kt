package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SameTreeTest : AlgorithmTest<SameTree>(SameTree::class) {

    override fun parameters() =
        listOf(
            arrayOf(TreeNode.of(arrayOf(1, 2, 3)), TreeNode.of(arrayOf(1, 2, 3))) to true,
            arrayOf(TreeNode.of(arrayOf(1, 2)), TreeNode.of(arrayOf(1, null, 2))) to false,
            arrayOf(TreeNode.of(arrayOf(1, 2, 1)), TreeNode.of(arrayOf(1, 1, 2))) to false
        )
}