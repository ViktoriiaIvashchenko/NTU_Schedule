package Utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

public class TeacherAdapter extends ArrayAdapter<Teacher> implements Filterable {

    private List<Teacher> originalList;
    private List<Teacher> filteredList;
    private TeacherFilter teacherFilter;

    public TeacherAdapter(Context context, List<Teacher> teacherList) {
        super(context, 0, teacherList);
        originalList = teacherList;
        filteredList = new ArrayList<>(teacherList);
        teacherFilter = new TeacherFilter();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Виконайте налаштування вашого елемента списку
        // ...
        return convertView;
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public Teacher getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public Filter getFilter() {
        return teacherFilter;
    }

    private class TeacherFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<Teacher> filteredValues = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                // Якщо рядок пошуку порожній, поверніть оригінальний список
                filteredValues.addAll(originalList);
            } else {
                // Виконайте фільтрацію на основі рядка пошуку
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Teacher teacher : originalList) {
                    if (teacher.getTeacher_name().toLowerCase().contains(filterPattern)) {
                        filteredValues.add(teacher);
                    }
                }
            }

            results.values = filteredValues;
            results.count = filteredValues.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredList.clear();
            filteredList.addAll((List<Teacher>) results.values);
            notifyDataSetChanged();
        }
    }
}

