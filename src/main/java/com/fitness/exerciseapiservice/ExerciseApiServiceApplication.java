package com.fitness.exerciseapiservice;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.model.GifLocation;
import com.fitness.exerciseapiservice.model.Workout;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import com.fitness.exerciseapiservice.repository.GifLocationRepository;
import com.fitness.exerciseapiservice.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class ExerciseApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApiServiceApplication.class, args);
    }

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private GifLocationRepository gifLocationRepository;

    @Bean
    @Profile("production")
    public CommandLineRunner init(){
        return args -> {

            UUID uuid = UUID.randomUUID();
            Exercise exercise_1 = Exercise.builder()
                    .id(uuid)
                    .name("Elbow to knee")
                    .description("Begin on all-fours with your hands under your shoulders and your knees under your sitz bones. Find a long neutral spine, wide collar bones, and a connected core. Lift your right arm forward and your left leg back. Inhale and reach your fingertips away from your toes until your spine lengthens into an arch. Exhale and deepen your stomach in towards your spine to draw your right elbow to your left knee, allowing the spine to round. Repeat for 10 reps then switch sides to do 10 reps on the opposite side.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(10)
                    .build();

            GifLocation location_1 = GifLocation.builder()
                    .location("src/main/resources/static/elbow-to-knee.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_2 = Exercise.builder()
                    .id(uuid)
                    .name("Opposition reach")
                    .description("Lie on your back with your legs in tabletop position and your arms reaching up over your shoulders towards the ceiling.  Exhale to engage your deep core around a neutral spine. Reach your right leg out to 45 degrees as you lengthen your left arm back overhead. Inhale to return to your starting position. Repeat on the opposite side, being sure to keep a stable pelvis and a connected core. Do 10 alternating reps on each side.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(5)
                    .build();

            GifLocation location_2 = GifLocation.builder()
                    .location("src/main/resources/static/opposition-reach.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_3 = Exercise.builder()
                    .id(uuid)
                    .name("Double leg kicks")
                    .description("Begin lying on your stomach with your hands clasped behind your mid back. Bend both knees to kick your heels towards your sitz bones. Keep the fronts of your hips pressed to the mat. Extend the legs straight as you reach your arms back and lengthen your upper spine into an arch. Turn the head to one side as you lower, alternating head turns with each rep. Perform 8 times.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(15)
                    .build();

            GifLocation location_3 = GifLocation.builder()
                    .location("src/main/resources/static/double-leg-kicks.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_4 = Exercise.builder()
                    .id(uuid)
                    .name("Back support")
                    .description("Start sitting on your sitz bones with your legs extended in front of you and your arms behind you, fingers facing your hips. With straight arms and legs, press in to your feet and hands to lift the hips up. You’ll make one long line from toes to head. Hold, with your shoulders wide, as you lift and lower your right leg, then your left. Lower your hips down to return to starting position. Repeat for 8 reps.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(20)
                    .build();

            GifLocation location_4 = GifLocation.builder()
                    .location("src/main/resources/static/back-support.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_5 = Exercise.builder()
                    .id(uuid)
                    .name("T-press")
                    .description("Begin lying on your stomach with your arms reaching out to the side at shoulder height. Deepen your belly and lengthen your spine to lift your head, neck and shoulders up just an inch or two into a small arch. Float your hands up a few inches while reaching wide through your back, shoulders, and arms as though you are reaching your fingertips from wall to wall. Reach the arms back towards your hips as you lengthen your heart up and forward to increase the arch. Reverse the action to return to starting position Repeat for 8 reps.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(15)
                    .build();

            GifLocation location_5 = GifLocation.builder()
                    .location("src/main/resources/static/t-press.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_6 = Exercise.builder()
                    .id(uuid)
                    .name("Bridge variation")
                    .description("Start lying on your back with your knees bent, feet flat, heels in line with your sitz bones. Press in to your feet to lift your hips up in to a bridge, maintaining a neutral spine. Fold your right leg to table top. Extend it straight out parallel to the ground. Fold it back in to tabletop. Return it to the floor. Keep your pelvis and spine completely stable while you do this. Then exhale and roll down from the bridge back to starting position, articulating through your spine one vertebra at a time. Repeat the whole thing with the left leg. Do 10 reps on each side, alternating.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(30)
                    .build();

            GifLocation location_6 = GifLocation.builder()
                    .location("src/main/resources/static/bridge-variation.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_7 = Exercise.builder()
                    .id(uuid)
                    .name("Kneeling side leg twist")
                    .description("Kneel on the right leg with your left leg extended out straight to the side. Have your right arm supporting you with your palm on the floor under your right shoulder and your left arm reaching to the sky. Lift your left leg up just above hip height then lower it back to the floor. Reach your left arm around to thread it under your right side and draw you in to a twist towards the floor. Reach it back to the ceiling to return to starting position. Perform 10 reps on that side and then switch sides to perform 10 reps on the opposite side.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(50)
                    .build();

            GifLocation location_7 = GifLocation.builder()
                    .location("src/main/resources/static/kneeling-side-leg-twist.gif")
                    .exerciseId(uuid)
                    .build();

            uuid = UUID.randomUUID();
            Exercise exercise_8 = Exercise.builder()
                    .id(uuid)
                    .name("Pinwheel")
                    .description("Lie on your right side with your knees bent and your right hand under your head. Extend your left arm forward in front of your shoulder. Draw your fingers along the floor in to a long, reaching circle over your head and behind you. Allow your upper body to fall in to a twist. Reverse the motion to return to starting position. Repeat 3 times on each side.")
                    .gifUrl("image/" + uuid)
                    .lengthInSeconds(25)
                    .build();

            GifLocation location_8 = GifLocation.builder()
                    .location("src/main/resources/static/pinwheel.gif")
                    .exerciseId(uuid)
                    .build();

            exerciseRepository.save(exercise_1);
            exerciseRepository.save(exercise_2);
            exerciseRepository.save(exercise_3);
            exerciseRepository.save(exercise_4);
            exerciseRepository.save(exercise_5);
            exerciseRepository.save(exercise_6);
            exerciseRepository.save(exercise_7);
            exerciseRepository.save(exercise_8);

            gifLocationRepository.saveAll(Arrays.asList(location_1, location_2, location_3,
                    location_4, location_5, location_6, location_7, location_8));

            Workout workout_1 = Workout.builder()
                    .name("first")
                    .exercises(Arrays.asList(exercise_1, exercise_2, exercise_3, exercise_4))
                    .build();

            Workout workout_2 = Workout.builder()
                    .name("second")
                    .exercises(Arrays.asList(exercise_5, exercise_6, exercise_7, exercise_8))
                    .build();

            workoutRepository.save(workout_1);
            workoutRepository.save(workout_2);

        };
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
