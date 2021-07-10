package com.ranzan.idenditycardproblemcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView companyName;
    private TextView age;
    private TextView profession;
    private ImageView imageView;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        companyName = itemView.findViewById(R.id.tvCompanyName);
        age = itemView.findViewById(R.id.tvAge);
        profession = itemView.findViewById(R.id.tvProfession);
        imageView = itemView.findViewById(R.id.ivImage);
    }

    protected void setData(Person person) {
        companyName.setText(person.getCompanyName());
        age.setText(person.getAge()+"");
        profession.setText(person.getProfession());
        imageView.setImageResource(person.getImageID());
    }
}
