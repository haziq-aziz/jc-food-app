package com.example.foodpack.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class BottomAppBarCutoutShape(
    private val fabDiameter: Float,
    private val fabMargin: Dp
): Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val fabMarginPx = with(density) { fabMargin.toPx() }
        val notchRadius = fabDiameter / 2 + fabMarginPx
        val centerX = size.width / 2
        val notchDepth = 80f

        val path = Path().apply {
            moveTo(0f, 0f)
            lineTo(centerX - notchRadius, 0f)

            cubicTo(
                centerX - notchRadius * 0.66f, 0f,
                centerX - notchRadius * 0.66f, notchDepth,
                centerX, notchDepth
            )
            cubicTo(
                centerX + notchRadius * 0.66f, notchDepth,
                centerX + notchRadius * 0.66f, 0f,
                centerX + notchRadius, 0f
            )

            lineTo(size.width, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
        }

        return Outline.Generic(path)
    }
}

@Composable
fun CutoutBottomAppBar(
    modifier: Modifier = Modifier,
    fabSize: Dp = 56.dp,
    fabMargin: Dp = 16.dp,
    color:Color = MaterialTheme.colorScheme.surfaceVariant,
   content: @Composable RowScope. () -> Unit
) {
    val fabDiameterPx = with(LocalDensity.current) { fabSize.toPx() }

    val cutoutShape = BottomAppBarCutoutShape(
        fabDiameter = fabDiameterPx,
        fabMargin = fabMargin
    )

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp),
        shape = cutoutShape,
        shadowElevation = 8.dp,
        color = color
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

@Preview
@Composable
private fun PrevCutoutShape() {
    CutoutBottomAppBar {
        repeat(2) {
            Text("A")
        }
    }
}