/*
 * Copyright 2021 Răzvan Roșu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.sedici.tasks.data.local.android.common

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import app.sedici.tasks.data.local.common.AppDatabase
import app.sedici.tasks.data.local.common.model.AccountEntity
import app.sedici.tasks.data.local.common.model.TaskEntity

@Database(
    entities = [
        AccountEntity::class,
        TaskEntity::class, // TODO remove after implementing multiple account management
    ],
    version = 1,
    exportSchema = true,
)
@TypeConverters(SediciTasksTypeConverters::class)
abstract class AppRoomDatabase : RoomDatabase(), AppDatabase
