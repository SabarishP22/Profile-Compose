package com.example.profilesamplecompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.profilesamplecompose.R
import com.example.profilesamplecompose.model.Photo
import com.example.profilesamplecompose.model.Story

@Composable
fun ProfileScreen(navController: NavHostController) {

    val storyList = listOf(
        Story(R.drawable.profile_1, "Adams"),
        Story(R.drawable.profile_2, "Sophia"),
        Story(R.drawable.profile_3, "Jackson"),
        Story(R.drawable.profile_4, "Olivia"),
        Story(R.drawable.profile_5, "Ethan"),
        Story(R.drawable.profile_6, "Emma"),
        Story(R.drawable.profile_7, "Aiden"),
        Story(R.drawable.profile_8, "Isabella"),
        Story(R.drawable.profile_9, "Liam"),
        Story(R.drawable.profile_10, "Mia"),
    )

    val photoList = listOf(
        Photo(R.drawable.profile_8),
        Photo(R.drawable.profile_6),
        Photo(R.drawable.profile_10),
        Photo(R.drawable.profile_9),
        Photo(R.drawable.profile_5),
        Photo(R.drawable.profile_2),
        Photo(R.drawable.profile_7),
        Photo(R.drawable.profile_1),
        Photo(R.drawable.profile_5),
        Photo(R.drawable.profile_3),
    )

    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val guidelineOffset: Dp = maxHeight * 0.37f
        Image(
            painter = painterResource(R.drawable.profile_1),
            modifier = Modifier
                .fillMaxSize()
                .alpha(.99f),
            contentDescription = "coverImage",
            contentScale = ContentScale.Crop
        )

        Text(
            text = "", modifier = Modifier
                .fillMaxSize()
                .background(Color(0x8B1F1C1C))
        )

        Box(
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0x1AFFFFFF))
                .align(Alignment.TopStart)

        ) {
            Image(
                painter = painterResource(R.drawable.left_arrow),
                modifier = Modifier
                    .padding(end = 2.dp)
                    .fillMaxSize()
                    .padding(6.dp),
                contentDescription = "backArrow",
                colorFilter = ColorFilter.tint(Color.White)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(maxHeight - guidelineOffset)
                .offset(y = guidelineOffset)
        ) {
            Image(
                painter = painterResource(R.drawable.gift_icon),
                modifier = Modifier
                    .padding(end = 15.dp)
                    .size(45.dp)
                    .offset(y = (-60).dp)
                    .align(Alignment.TopEnd),
                contentDescription = "likesImage",
            )

            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.padding(start = 15.dp)) {
                        Text(
                            text = "Anastasia",
                            modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight(),
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.popins_700)),
                            color = Color.White
                        )
                        Text(
                            text = "Adams", modifier = Modifier.wrapContentWidth(),
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.popins_700)),
                            color = Color.White
                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.heart),
                        modifier = Modifier
                            .padding(top = 10.dp, end = 15.dp)
                            .size(45.dp),
                        contentDescription = "likesImage",
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 15.dp, top = 10.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        text = "1615",
                        fontSize = 20.sp,
                        color = Color(0xD1FFFFFF),
                        fontFamily = FontFamily(Font(R.font.popins_600))
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .align(Alignment.CenterVertically),
                        text = "followers",
                        fontSize = 14.sp,
                        color = Color(0xD1FFFFFF),
                        fontFamily = FontFamily(Font(R.font.popins_600))
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 35.dp)
                            .align(Alignment.CenterVertically),
                        text = "12412",
                        fontSize = 20.sp,
                        color = Color(0xD1FFFFFF),
                        fontFamily = FontFamily(Font(R.font.popins_600))
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .align(Alignment.CenterVertically),
                        text = "likes",
                        fontSize = 14.sp,
                        color = Color(0xD1FFFFFF),
                        fontFamily = FontFamily(Font(R.font.popins_600))
                    )
                }

                Row {
                    Column {
                        Text(
                            text = "STORIES", color = Color(0xFFB8B4B4),
                            fontFamily = FontFamily(Font(R.font.popins_600)),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(top = 45.dp)
                                .rotate(-90f)
                        )

                        VerticalDivider(
                            color = Color(0xFFB8B4B4),
                            thickness = 3.dp,
                            modifier = Modifier
                                .padding(top = 40.dp)
                                .align(Alignment.CenterHorizontally)
                                .height(70.dp)
                                .width(3.dp)
                                .clip(RoundedCornerShape(50.dp))
                        )
                        Text(
                            text = "PHOTOS", color = Color(0xFFB8B4B4),
                            fontFamily = FontFamily(Font(R.font.popins_600)),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(top = 45.dp)
                                .rotate(-90f)
                        )

                        VerticalDivider(
                            color = Color(0xFFB8B4B4),
                            thickness = 3.dp,
                            modifier = Modifier
                                .padding(top = 35.dp)
                                .align(Alignment.CenterHorizontally)
                                .height(70.dp)
                                .width(3.dp)
                                .clip(RoundedCornerShape(50.dp))
                        )
                    }

                    Column {
                        LazyRow(modifier = Modifier.padding(top = 10.dp)) {
                            items(storyList) { story ->
                                StoryList(story = story)
                            }
                        }

                        LazyVerticalGrid(
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .clip(RoundedCornerShape(topStart = 30.dp)),
                            columns = GridCells.Fixed(2)
                        ) {
                            items(photoList) { photo ->
                                PhotosList(photo = photo)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StoryList(story: Story) {
    Column {
        Image(
            painter = painterResource(story.storyImage),
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .size(70.dp)
                .clip(RoundedCornerShape(50.dp)),
            contentDescription = "storyImage",
            contentScale = ContentScale.Crop
        )
        Text(
            text = story.storyName, color = Color(0xFFBFBBBB),
            fontFamily = FontFamily(Font(R.font.popins_700)),
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun PhotosList(photo: Photo) {
    Column {
        Image(
            painter = painterResource(photo.image),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentDescription = "storyImage",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun ProfilePreview() {
    val navController = rememberNavController()
    ProfileScreen(navController = navController)
}