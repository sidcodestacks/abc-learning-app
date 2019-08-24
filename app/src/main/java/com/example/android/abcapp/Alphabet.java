package com.example.android.abcapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class Alphabet extends Activity implements View.OnClickListener  {
        CardView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
        MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_main);
        a=findViewById(R.id.a);
        a.setBackgroundResource(R.drawable.gradient);
        b=findViewById(R.id.b);
        b.setBackgroundResource(R.drawable.gradient);
        c=findViewById(R.id.c);
        c.setBackgroundResource(R.drawable.gradient);
        d=findViewById(R.id.d);
        d.setBackgroundResource(R.drawable.gradient);
        e=findViewById(R.id.e);
        e.setBackgroundResource(R.drawable.gradient);
        f=findViewById(R.id.f);
        f.setBackgroundResource(R.drawable.gradient);
        g=findViewById(R.id.g);
        g.setBackgroundResource(R.drawable.gradient);
        h=findViewById(R.id.h);
        h.setBackgroundResource(R.drawable.gradient);
        i=findViewById(R.id.i);
        i.setBackgroundResource(R.drawable.gradient);
        j=findViewById(R.id.j);
        j.setBackgroundResource(R.drawable.gradient);
        k=findViewById(R.id.k);
        k.setBackgroundResource(R.drawable.gradient);
        l=findViewById(R.id.l);
        l.setBackgroundResource(R.drawable.gradient);
        m=findViewById(R.id.m);
        m.setBackgroundResource(R.drawable.gradient);
        n=findViewById(R.id.n);
        n.setBackgroundResource(R.drawable.gradient);
        o=findViewById(R.id.o);
        o.setBackgroundResource(R.drawable.gradient);
        p=findViewById(R.id.p);
        p.setBackgroundResource(R.drawable.gradient);
        q=findViewById(R.id.q);
        q.setBackgroundResource(R.drawable.gradient);
        r=findViewById(R.id.r);
        r.setBackgroundResource(R.drawable.gradient);
        s=findViewById(R.id.s);
        s.setBackgroundResource(R.drawable.gradient);
        t=findViewById(R.id.t);
        t.setBackgroundResource(R.drawable.gradient);
        u=findViewById(R.id.u);
        u.setBackgroundResource(R.drawable.gradient);
        v=findViewById(R.id.v);
        v.setBackgroundResource(R.drawable.gradient);
        w=findViewById(R.id.w);
        w.setBackgroundResource(R.drawable.gradient);
        x=findViewById(R.id.x);
        x.setBackgroundResource(R.drawable.gradient);
        y=findViewById(R.id.y);
        y.setBackgroundResource(R.drawable.gradient);
        z=findViewById(R.id.z);
        z.setBackgroundResource(R.drawable.gradient);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

        }


public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater factory;
        View view;
        ImageView image;
        switch (v.getId()){

        case R.id.a:

        ourSong=MediaPlayer.create(this,R.raw.a);
        ourSong.start();
        builder.setTitle("A");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.a);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.b:

        ourSong=MediaPlayer.create(this,R.raw.b);
        ourSong.start();
        builder.setTitle("B");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.b);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.c:

        ourSong=MediaPlayer.create(this,R.raw.c);
        ourSong.start();
        builder.setTitle("C");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.c);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.d:

        ourSong=MediaPlayer.create(this,R.raw.d);
        ourSong.start();
        builder.setTitle("D");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.d);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.e:

        ourSong=MediaPlayer.create(this,R.raw.e);
        ourSong.start();
        builder.setTitle("E");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.e);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.f:

        ourSong=MediaPlayer.create(this,R.raw.f);
        ourSong.start();
        builder.setTitle("F");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.f);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.g:

        ourSong=MediaPlayer.create(this,R.raw.g);
        ourSong.start();
        builder.setTitle("G");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.g);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.h:

        ourSong=MediaPlayer.create(this,R.raw.h);
        ourSong.start();
        builder.setTitle("H");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.h);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.i:

        ourSong=MediaPlayer.create(this,R.raw.i);
        ourSong.start();
        builder.setTitle("I");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.i);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.j:

        ourSong=MediaPlayer.create(this,R.raw.j);
        ourSong.start();
        builder.setTitle("J");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.j);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.k:

        ourSong=MediaPlayer.create(this,R.raw.k);
        ourSong.start();
        builder.setTitle("K");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.k);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.l:

        ourSong=MediaPlayer.create(this,R.raw.l);
        ourSong.start();
        builder.setTitle("L");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.l);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.m:

        ourSong=MediaPlayer.create(this,R.raw.m);
        ourSong.start();
        builder.setTitle("M");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.m);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.n:

        ourSong=MediaPlayer.create(this,R.raw.n);
        ourSong.start();
        builder.setTitle("N");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.n);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.o:

        ourSong=MediaPlayer.create(this,R.raw.o);
        ourSong.start();
        builder.setTitle("O");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.o);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.p:

        ourSong=MediaPlayer.create(this,R.raw.p);
        ourSong.start();
        builder.setTitle("P");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.p);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.q:

        ourSong=MediaPlayer.create(this,R.raw.q);
        ourSong.start();
        builder.setTitle("Q");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.q);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.r:

        ourSong=MediaPlayer.create(this,R.raw.r);
        ourSong.start();
        builder.setTitle("R");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.r);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.s:

        ourSong=MediaPlayer.create(this,R.raw.s);
        ourSong.start();
        builder.setTitle("S");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.s);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.t:

        ourSong=MediaPlayer.create(this,R.raw.t);
        ourSong.start();
        builder.setTitle("T");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.t);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.u:

        ourSong=MediaPlayer.create(this,R.raw.u);
        ourSong.start();
        builder.setTitle("U");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.u);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.v:

        ourSong=MediaPlayer.create(this,R.raw.v);
        ourSong.start();
        builder.setTitle("V");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.v);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.w:

        ourSong=MediaPlayer.create(this,R.raw.w);
        ourSong.start();
        builder.setTitle("W");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.w);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.x:

        ourSong=MediaPlayer.create(this,R.raw.x);
        ourSong.start();
        builder.setTitle("X");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.x);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.y:

        ourSong=MediaPlayer.create(this,R.raw.y);
        ourSong.start();
        builder.setTitle("Y");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.y);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        case R.id.z:

        ourSong=MediaPlayer.create(this,R.raw.z);
        ourSong.start();
        builder.setTitle("Z");
        factory = LayoutInflater.from(Alphabet.this);
        view = factory.inflate(R.layout.a, null);
        image= (ImageView) view.findViewById(R.id.ai);
        image.setImageResource(R.drawable.z);
        builder.setView(view);
        builder.setNeutralButton("BACK", null);
        builder.show();
        break;
        }
        }


        }
