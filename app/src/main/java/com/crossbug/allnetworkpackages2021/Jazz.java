package com.crossbug.allnetworkpackages2021;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Jazz extends Fragment {


    List<packagedetail> data;
    String [] title;
    String [] description;
    String [] code;
    String tab;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View v = inflater.inflate(R.layout.activity_telenor,container,false);
        Bundle val =  getArguments();
        tab = val.getString("tab");
        initialization(v);
        return v;
    }


    void initialization(View item)
    {

        data = new ArrayList<>();

        if(tab.equals("Hybrid"))
        {
            title = getResources().getStringArray(R.array.jazzdatahybrid_name);
            description = getResources().getStringArray(R.array.jazzdatahybrid_description);
            code = getResources().getStringArray(R.array.jazzdatahybrid_code);
        }
        if(tab.equals("Data"))
        {
            title = getResources().getStringArray(R.array.jazzdatadata_name);
            description = getResources().getStringArray(R.array.jazzdatadata_description);
            code = getResources().getStringArray(R.array.jazzdatadata_code);
        }
        if(tab.equals("Calls"))
        {
            title = getResources().getStringArray(R.array.jazzdatacall_name);
            description = getResources().getStringArray(R.array.jazzdatacall_description);
            code = getResources().getStringArray(R.array.jazzdatacall_code);
        }
        if(tab.equals("Sms"))
        {
            title = getResources().getStringArray(R.array.jazzdatasms_name);
            description = getResources().getStringArray(R.array.jazzdatasms_description);
            code = getResources().getStringArray(R.array.jazzdatasms_code);
        }


        for(int i =0 ; i<title.length;i++)
        {
            packagedetail obj = new packagedetail();
            obj.setTitle(title[i]);
            obj.setDescription(description[i]);
            obj.setCode(code[i]);
            data.add(obj);
        }
        RecyclerView rc = item.findViewById(R.id.telenorrc);
        myrcadapter myrcadapter = new myrcadapter();
        rc.setAdapter(myrcadapter);
        rc.setLayoutManager(new LinearLayoutManager(getContext()));
    }


    class myrcadapter extends RecyclerView.Adapter<myrcadapter.myviewholder>
    {


        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(getContext()).inflate(R.layout.row_design,parent,false);
            myviewholder obj = new myviewholder(v);
            return obj;
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, final int position)
        {
            holder.title.setText(data.get(position).getTitle());
            holder.description.setText(data.get(position).getDescription());
            holder.img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {

                    if(ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getContext(),"Please grant permission",Toast.LENGTH_SHORT).show();
                        ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CALL_PHONE},1);
                    }else {
                        Intent intentCall=new Intent(Intent.ACTION_CALL);
                        intentCall.setData(Uri.parse("tel:"+data.get(position).getCode()));
                        //intentCall.setData(Uri.parse("tel:03067595607"));
                        startActivity(intentCall);
                    }




                }
            });
        }

        @Override
        public int getItemCount() {

            if(data !=null)
                return data.size();
            return 0;
        }

        class myviewholder extends RecyclerView.ViewHolder
        {

            TextView title;
            TextView description;
            ImageView img ;

            public myviewholder(@NonNull View itemView)
            {
                super(itemView);

                title = itemView.findViewById(R.id.cardview_list_title1);
                description = itemView.findViewById(R.id.short_description1);
                img = itemView.findViewById(R.id.cardview_image1);
            }
        }

    }


}
