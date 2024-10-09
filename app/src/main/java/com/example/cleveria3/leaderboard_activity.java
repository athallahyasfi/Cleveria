
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		leaderboard
	 *	@date 		Wednesday 09th of October 2024 12:16:09 PM
	 *	@title 		Page 2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


	package com.example.cleveria3;;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class leaderboard_activity extends Activity {

	
	private View _bg__leaderboard;
	private ImageView multilr;
	private View backlr;
	private View selectr;
	private TextView score_board;
	private ImageView _profiler;
	private ImageView leaderboardr;
	private ImageView homer;
	private ImageView pessi;
	private ImageView ripvw;
	private ImageView dutchvdl;
	private ImageView yasiral;
	private ImageView toprank;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.leaderboard);

		
		_bg__leaderboard = (View) findViewById(R.id._bg__leaderboard);
		multilr = (ImageView) findViewById(R.id.multilr);
		backlr = (View) findViewById(R.id.backlr);
		selectr = (View) findViewById(R.id.selectr);
		score_board = (TextView) findViewById(R.id.score_board);
		_profiler = (ImageView) findViewById(R.id._profiler);
		leaderboardr = (ImageView) findViewById(R.id.leaderboardr);
		homer = (ImageView) findViewById(R.id.homer);
		pessi = (ImageView) findViewById(R.id.pessi);
		ripvw = (ImageView) findViewById(R.id.ripvw);
		dutchvdl = (ImageView) findViewById(R.id.dutchvdl);
		yasiral = (ImageView) findViewById(R.id.yasiral);
		toprank = (ImageView) findViewById(R.id.toprank);
	
		
		_profiler.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), completet_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	